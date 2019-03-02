<template>
  <div id="Navbar">

    <h1>Oc'Biblio</h1>

    <md-menu md-align-trigger>
      <md-button md-menu-trigger id='boutonMenuHome' href='/#/' style='text-decoration:none'>
        <strong>Home</strong></md-button>
    </md-menu>

    <md-menu md-direction='bottom-start'>
      <md-button md-menu-trigger><strong>Nos Livres</strong></md-button>
      <md-menu-content>
        <md-menu-item href='/#/booksearch'>Trouver un Livre</md-menu-item>
        <md-menu-item  href='/#/bookcreate'>Ajouter un Livre</md-menu-item>
      </md-menu-content>
    </md-menu>

    <md-menu md-direction='bottom-start'>
      <md-button md-menu-trigger><strong>Mon Profil</strong></md-button>
      <md-menu-content>
        <md-menu-item href='/#/u-info'>Mes informations</md-menu-item>
        <md-menu-item href='/#/u-loan'>Ma liste de prêts</md-menu-item>
      </md-menu-content>
    </md-menu>
  </div>
</template>

<script>export default {name: 'Navbar'}
</script>

<style scoped>
  strong {
    font-size: medium;
    font-family: "Calibri Light";
  }
  .md-menu-item{
    font-family: "Calibri Light";
  }
  h1{
    font-family: "Yu Gothic UI";
    font-size: xx-large;
  }
</style>
