<template>
    <div id="Test">
      <h2>J'ajoute un livre...</h2>
      <p>J'ai fait don d'un de mes livres à la bibliothèque et je souhaite l'enregistrer
        pour que d'autres personnes puissent le lire.</p>
      <div class="md-content" id="form-content">
      <form id="form-create-books" class="form-group label-floating">
        <div class="md-input-container">
      <md-field>
        <label>Titre</label>
        <md-input id="titre" name="titre" type="text" v-model="titre"></md-input>
        <span class="md-helper-text">Indiquez le titre du livre.</span>
      </md-field>
      <md-field>
        <label>Description</label>
        <md-textarea id="description" name="description" type="text" v-model="description"></md-textarea>
        <span class="md-helper-text">Résumé du livre.</span>
      </md-field>
      <md-field>
        <label>Auteur</label>
        <md-input id="auteur" name="auteur" type="text" v-model="auteur"></md-input>
        <span class="md-helper-text">L'auteur du livre.</span>
      </md-field>
      <md-field>
        <label>Image</label>
        <md-input id="image" name="image" type="text" v-model="image"></md-input>
        <span class="md-helper-text">Image de la couverture.</span>
      </md-field>
          <md-button class="md-raised md-default" @click="createbook">Créer</md-button>
        </div>
      </form>
      </div>
    </div>
</template>

<script>import axios from 'axios'
export default {
  name: 'Test',
  data () {
    return {
      titre: '',
      description: '',
      auteur: '',
      image: ''
    }
  },
  methods: {
    /* eslint-disable no-console */
    createbook () {
      axios.post('http://localhost:8282/book-service/createBook?titre=' + this.titre + '&description=' + this.description + '&auteur=' + this.auteur + '&image=' + this.image)
      // axios.post('http://localhost:8282/book-service/createBook', {params: {titre: this.titre, description: this.description, auteur: this.auteur, image: this.image}})
        .then(response => {
          console.log(response.data)
        }).catch(e => {
          console.log('erreur', e)
        })
    }
  }
}
</script>

<style scoped>
  #form-content{
    margin: 0 auto;
    width: 400px;
  }
  #form-create-books{
    margin: 40px;
  }
</style>

<!--<script>export default {-->
  <!--name: 'Test',-->
  <!--data () {-->
    <!--return {-->
      <!--titre: '',-->
      <!--description: '',-->
      <!--auteur: '',-->
      <!--image: ''-->
    <!--}-->
  <!--},-->
  <!--methods: {-->
    <!--/* eslint-disable no-console */-->
    <!--createbook () {-->
      <!--this.$http.post('http://localhost:8282/book-service/createBook?titre=' + this.titre + '&description=' + this.description + '&auteur=' + this.auteur + '&image=' + this.image)-->
        <!--.then(response => {-->
          <!--console.log(response.data)-->
        <!--}).catch(e => {-->
        <!--console.log('erreur', e)-->
      <!--})-->
    <!--}-->
  <!--}-->
<!--}-->
<!--</script>-->
