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
                        <div class="ml-2">
                            <!-- <p>Dummy Heading</p> -->
                            <li>
                                <a class>Home</a>
                            </li>
                            <li>
                                <a>Tambah KK</a>
                            </li>
                            
                            <li class="mt-5">
                                <a>Sign Out</a>
                            </li>
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


</style>