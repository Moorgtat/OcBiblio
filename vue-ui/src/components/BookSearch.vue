<template>
  <div id='BookSearch'>

    <h2>Je cherche un livre...</h2>
    <p> Tout nos livres disponibles sont ici.</p>

    <div id="global-book-container">
    <div class="md-content" id="booksContainer">
      <md-card id="card-expanse" v-for="book in books" :key="book.id">
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
  name: 'BookSearch',
  data () {
    return {
      books: []
    }
  },
  mounted () {
    this.$http.get('http://localhost:8282/book-service/allBooks').then((response) => {
      console.log('succes', response)
      this.books = response.data
    }, (response) => {
      console.log('erreur', response)
    })
  }
}
</script>

<style scoped>
#global-book-container{
  display: inline-block;
  width: 70%;
  margin-bottom: 100px;
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
</style>
