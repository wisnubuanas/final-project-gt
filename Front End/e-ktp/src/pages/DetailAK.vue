<template>
    <div>
  
                    <Detail></Detail>
      <Sidebar></Sidebar>
      
        
    </div>
  </template>
  
  <script>
  
  import Detail from '../components/Detailanggota.vue'
  import Sidebar from '../components/Sidebar.vue'
  
  export default {
      name : 'HomePage',
      components: {
  
          Detail,
          Sidebar,
  
        
    },
  }
  </script>
  
  <!-- <style>
#d{
    margin-left: 50px;
}
  </style> -->