<template>
<div>
    <div class="wrapper">
            <!-- Sidebar Holder -->
            <nav id="sidebar">
                <ul class="list-unstyled components">
                    <div class="sidebar-header">
                        <h3>E-KTP APP</h3>
                    </div>
                </ul>
                <ul class="list-unstyled components">
                        <div class="ml-2 text-white">
                            <!-- <p>Dummy Heading</p> -->
                            <div class="menu">
                                <router-link to="/home" class="text-white nav-link">Home</router-link>
                            </div>
                            <div class=" menu mt-3">
                                <!-- <img src="../assets/portrait.png" style="width: 50px; height: auto;"> -->
                                <router-link to="/addkk" class="text-white nav-link">Tambah KK</router-link>
                            </div>
                            
                                <div class=" sign-out menu px-2 py-2" >
                                    <!-- <img src="../assets/log-out.png" style="width: 20px; height: auto;"> -->
                                    <router-link  to="/" class="text-white nav-link">Sign Out</router-link>
                                    
                            </div>
                        </div>
                </ul>
                        
            </nav>
            <!-- https://bootsnipp.com/snippets/gNGoM -->
            <!-- Page Content Holder -->
            
        </div>
</div>
  
</template>

<script>
export default {
name : 'SidebarComponents',
}
</script>

<style>

@import "https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700";

/* ---------------------------------------------------
    SIDEBAR STYLE
----------------------------------------------------- */
#sidebar {
    width: 250px;
    position: fixed;
    top: 0;
    left: 0;
    height: 100vh;
    z-index: 999;
    background: #000044;
    color: #fff;

    /* kotak home sampai tambah kk */
}

#sidebar.active {
    margin-left: -250px;
}

#sidebar .sidebar-header {
    padding: 20px;
    background: #000080;
    /* tulisan header */
}

#sidebar ul.components {
    padding: 20px 0;
    /* border-bottom: 1px solid #FFD700; */

}


#sidebar ul li a {
    padding: 10px;
    font-size: 1.1em;
    display: block;
}

.menu:hover{
    cursor: pointer;
    background-color: #000080;
}

.sign-out {
    margin-top: 300px;
}




</style>