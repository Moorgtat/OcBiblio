<template>
    <div id="Test">
      <h2>Je cherche un livre...</h2>

      <div class="md-content" id="form-content">
        <form id="form-search-books" class="form-group label-floating">
          <div class="md-input-container">
            <md-field>
              <label>Titre</label>
              <md-input id="titre" type="text" v-model="titre"></md-input>
            </md-field>
            <md-field>
              <label>Auteur</label>
              <md-input id="auteur" type="text" v-model="auteur"></md-input>
            </md-field>
          </div>
          <md-button class="md-raised md-default" type="submit">Chercher</md-button>
        </form>
      </div>

      <div id="result">
        <p> Titre : {{ titre }} </p>
        <p> Auteur : {{ auteur }} </p>
      </div>

      <div id="global-container">
        <div class="md-content" id="booksContainer">
          <md-card id="card-expanse" v-for="book in ListBooks" :key="book.id">
            <md-card-media>
              <img :src='book.image' alt="couverture du livre">
            </md-card-media>
            <md-card-header>
              <div class="md-title">{{book.titre}}</div>
              <div class="md-subhead">{{book.auteur}}</div>
            </md-card-header>
            <md-card-expand>
              <md-card-actions md-alignment="space-between">
                <div>
                  <md-button>Emprunter</md-button>
                </div>
                <md-card-expand-trigger>
                  <md-button>Description</md-button>
                </md-card-expand-trigger>
              </md-card-actions>
              <md-card-expand-content>
                <md-card-content>
                  {{book.description}}
                </md-card-content>
              </md-card-expand-content>
            </md-card-expand>
          </md-card>
        </div>
      </div>
    </div>
</template>

<script>export default {
  name: 'Test',
  data () {
    return {
      titre: '',
      auteur: '',
      ListBooks: []
    }
  }
}
// }
//   method()
// {
//   cherche(book)
//   {
//     this.ListBooks = this.$http.get('http://localhost:8282/book-service/searchBooks/').then((response) => {
//       console.log('succes', response)
//       this.books = response.data
//     }, (response) => {
//       console.log('erreur', response)
//     })
//   }

</script>

<style scoped>
  #global-container{
    display: inline-block;
    width: 70%;
  }
  #booksContainer{
    width: fit-content;
  }
  #card-expanse{
    width: 220px;
    margin: 15px;
    display: inline-block;
    vertical-align: top;
  }
  #form-content{
    margin: 0 auto;
    width: 400px;
  }
  #form-search-books{
    margin: 40px;
  }
</style>
