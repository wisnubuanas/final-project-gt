<template>
    <div>
      <div class="row">
        <div class="col-md-3">
          <Sidebar></Sidebar>
        </div>
        <div class="col-md-9">
          <DetailKK></DetailKK>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  
  import Sidebar from '../components/Sidebar.vue'
  import DetailKK from '../components/DetailKK.vue'
  
  export default {
      name : 'DetailKKPage',
      components: {
  
          Sidebar,
          DetailKK,
  
        
    },
  }
  </script>
  
  <style scoped>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  
  </style>