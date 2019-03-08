<template>
  <div id="home">
    <header>
      <navbar/>
    </header>
    <div id="presentation">
      <h2> Bienvenue {{ $parent.user.pseudo }}...</h2>
    <p>Je suis en manque de lecture.</p>
    <p>Je viens sur le site de la bibliothèque pour trouver un livre que je pourrais
      emprunter.</p>
    <p>Avec la possibilité de prolonger le prêt si je n'ai pas eu le temps de le lire.</p>
    <p>Une fois rendu, je pourrais le notifer sur le site.</p>
    <p>Et j'aimerais si j'ai oublié de le rendre que l'on m'envoit un email pour me le
      rappeler.</p>
    </div>
    <div id="find">
    <book-search/>
    </div>
    <div id="create">
    <book-create/>
    </div>
    <div id="infos">
    <user-info/>
    </div>
  </div>
</template>

<script>
import Navbar from './Navbar'
import BookSearch from './BookSearch'
import BookCreate from './BookCreate'
import UserInfo from './UserInfo'
export default {
  name: 'Home',
  components: {UserInfo, BookCreate, BookSearch, Navbar}}
</script>

<style scoped>
  #presentation{
    padding: 40px;
  }
  #find{
    padding: 40px;
  }
  #create{
    padding: 40px;
  }
  #infos{
    height: 400px;
    padding: 40px;
    margin-bottom: 80px;
  }
</style>
