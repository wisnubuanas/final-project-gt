<template>
    <div class="cards">
      <div class="card-body">
          <h5 class="card-title">Success!</h5>
          <p class="card-text" >Your Data Has Been {{ Judul }} !</p>
          <router-link to="/" v-if="Judul === 'Submit'">
            <button class="back btn btn-primary mt-3">Back</button>
          </router-link>
          <router-link to="/" v-else-if="Judul === 'Update'">
            <button class="back btn btn-primary mt-3">Back</button>
          </router-link>
        <button class="btn btn-primary" @click="RefreshFunc" v-else>Back</button>
      </div>
    </div>
  </template>
  
  <script>
  export default {
  name : 'SuccesComponent',
  data() {
      return {
        Judul: null,
      };
    },
    methods: {
      ubahJudul() {
        let route = this.$route.fullPath;
        if (route === "/add") {
          this.Judul = "inputed";
        } else if (route === "/"){
          this.Judul = " deleted";
        } else {
          this.Judul = "updated";
        }
      },
      RefreshFunc() {
        location.reload();
      },
    },
    mounted() {
      this.ubahJudul();
    },
  };
  </script>
  
  <style scoped>
  
  </style>