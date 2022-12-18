<template>
  <div>
    <div class="row">
      <div class="col-md-3">
        <Sidebar></Sidebar>
      </div>
      <div class="col-md-9">
        <Card></Card>
      </div>
    </div>
  </div>
</template>

<script>

import Sidebar from '../components/Sidebar.vue'
import Card from '../components/Card.vue'

export default {
    name : 'HomePage',
    components: {

        Sidebar,
        Card,

      
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