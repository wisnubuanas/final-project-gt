<template>
    <div>
        <div id="t">
            <Add></Add>
        </div>
                <Sidebar></Sidebar>
    </div>
</template>

<script>
import Add from '../components/Add.vue'
import Sidebar from '../components/Sidebar.vue'

export default {
    name : 'AddPage',
    components: {
        Add, 
        Sidebar,

      
  },
}
</script>

<style>
#t{
    margin-left: 100px;
}
</style>