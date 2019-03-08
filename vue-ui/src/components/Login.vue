<template>
  <div id="Login">
    <h1>Login</h1>
    <input type="text" name="username" v-model="input.username" placeholder="Username" />
    <input type="password" name="password" v-model="input.password" placeholder="Password" />
    <button type="button" @click="login">Login</button>
  </div>

</template>

<script>import axios from 'axios'
/* eslint-disable */
  export default {
    name: 'Login',
    data() {
      return {
        input: {
          username: '',
          password: ''
        }
      }
    },
    methods: {
      login () {
        axios.get('http://localhost:8081/LoadUser/?pseudo=' + this.input.username + '&password=' + this.input.password)
          .then(response => {
            this.user = response.data
            this.$emit('SendUser', this.user)
          console.log('succes', response)
        }, (response) => {
          console.log('erreur', response)
        })
        if(this.input.username === this.$parent.user.pseudo && this.input.password === this.$parent.user.password) {
          this.$emit('authenticated', true);
          this.$router.replace({ name: 'Home' });
        }
        else if(this.input.username !== '' && this.input.password !== '') {
          console.log('The username and / or password is incorrect')}
        else {
          console.log('A username and password must be present')
          }
        }
      }
    }
</script>

<style scoped>
  #Login {
    width: 400px;
    border: 1px solid #CCCCCC;
    background-color: #FFFFFF;
    margin: auto;
    padding: 20px;
  }
</style>
