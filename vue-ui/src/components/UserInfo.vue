<template>
    <div id="userinfo">
      <h2>Profil de {{ user.pseudo}}</h2>
      <p> Voici la liste des livres que tu empruntes en ce moment {{ user.pseudo}}. <br>
      N'oublie pas de les rendre en temps et en heure!</p>
      <md-button @click="listLoan(user.pseudo)">Mes emprunts en cours</md-button>
      <div id="tableLoanContainer" v-if="clicked">
        <md-table id="tableLoan">
          <md-table-row>
            <md-table-head>Titre</md-table-head>
            <md-table-head>Fin du Prêt</md-table-head>
            <md-table-head>Prolonger</md-table-head>
            <md-table-head>Rendre</md-table-head>
          </md-table-row>
          <md-table-row v-for="loan in ListLoans" :key="loan.id">
            <md-table-cell>{{loan.nomLivre}}</md-table-cell>
            <md-table-cell>{{loan.finPret}}</md-table-cell>
            <md-table-cell><md-button @click="PatchLoan(loan.id)">Prolonger</md-button></md-table-cell>
            <md-table-cell><md-button @click="DeleteLoan(loan.id)">Rendre</md-button></md-table-cell>
          </md-table-row>
        </md-table>
      </div>
      <div v-if="prolonger">
        <p> Vous avez prolonger votre prêt du livre <strong>{{loan.nomLivre}}</strong>
          jusqu'au <strong>{{loan.finPret}}</strong>.</p>
      </div>
      <div v-if="rendre">
        <p> Nous avons bien reçu votre livre. Merci <strong>{{user.pseudo}}</strong>.</p>
      </div>
    </div>
</template>

<script>import axios from 'axios'
export default {name: 'UserInfo',
  props: ['user'],
  data () {
    return {
      loan: {},
      rendre: false,
      prolonger: false,
      clicked: false
    }
  },
  methods: {
    /* eslint-disable no-console */
    listLoan (pseudo) {
      this.rendre = false
      this.prolonger = false
      this.clicked = false
      axios.get('http://localhost:8282/loan-service/ListLoans/?pseudo=' + pseudo)
        .then(response => {
          this.ListLoans = response.data
          console.log('succes', response)
          this.clicked = true
        }, (response) => {
          console.log('erreur', response)
        })
    },
    PatchLoan (patchId) {
      this.clicked = false
      this.prolonger = true
      axios.post('http://localhost:8282/loan-service/PatchLoan/?id=' + patchId)
        .then(response => {
          this.loan = response.data
          console.log('succes', response)
        }, (response) => {
          console.log('erreur', response)
        })
    },
    DeleteLoan (deleteId) {
      this.clicked = false
      this.rendre = true
      axios.get('http://localhost:8282/loan-service/DeleteLoan/?id=' + deleteId)
        .then(response => {
          console.log('succes', response)
        }, (response) => {
          console.log('erreur', response)
        })
    }
  }
}

</script>

<style scoped>
#userinfo{
  margin: 20px;

}
#tableLoanContainer{
  margin-left: 30%;
}
#tableLoan{
  width: 60%;
}
</style>
