<template>
  <div id="app">
    <div id="log">
    <router-link v-if="authenticated" to="/login" v-on:click.native="logout()" replace> <md-button>Logout</md-button></router-link>
    </div>
    <div id="content">
    <router-view @authenticated="setAuthenticated"/>
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar'
export default {
  name: 'App',
  components: {Navbar},
  data () {
    return {
      authenticated: false,
      mockAccount: {
        username: 'mathieu',
        password: '1234'
      }
    }
  },
  mounted () {
    if (!this.authenticated) {
      this.$router.replace({ name: 'Login' })
    }
  },
  methods: {
    setAuthenticated (status) {
      this.authenticated = status
    },
    logout () {
      this.authenticated = false
    }
  }
}
</script>

<style>
#app {
  font-family: Calibri Light, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  font-size: larger;
  color: #2c3e50;
  margin-top: 60px;
}
#log {
  margin-left: 60%;
}
</style>
