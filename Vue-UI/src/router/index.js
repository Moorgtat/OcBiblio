import Vue from 'vue'
import Router from 'vue-router'
import Home from '../components/Home'
import BookSearch from '../components/BookSearch'
import BookCreate from '../components/BookCreate'
import UserInfo from '../components/UserInfo'
import UserLoan from '../components/UserLoan'
import Test from '../components/Test'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/booksearch',
      name: 'BookSearch',
      component: BookSearch
    },
    {
      path: '/bookcreate',
      name: 'BookCreate',
      component: BookCreate
    },
    {
      path: '/u-info',
      name: 'UserInfo',
      component: UserInfo
    },
    {
      path: '/u-loan',
      name: 'UserLoan',
      component: UserLoan
    },
    {
      path: '/test',
      name: 'Test',
      component: Test
    }
  ]
})
