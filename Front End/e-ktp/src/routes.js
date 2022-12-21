import Login from "./pages/Login.vue";
import Register from './pages/Register.vue'
import Home from "./pages/Home.vue";
import AddKK from "./pages/AddKK.vue";
import DetailAK from "./pages/DetailAK.vue"
import DetailKK from "./pages/DetailKK.vue"
import ListAnggota from "./pages/ListAnggota.vue"
import test from "./pages/test.vue"

export default[
    {
        path: "/",
        component : Login,
    },
    {
        path: "/register",
        component : Register,
    },
    {
        path: "/home",
        component : Home,
    },
    {
        path: "/addKK",
        component : AddKK,
    },
    {
        path: "/detailAnggota",
        component : DetailAK,
    },
    {
        path: "/test",
        component : test,
    },
    {
        path: "/detailKK/:no_kk",
        component : DetailKK,
        name : 'details',
    },
    {
        path: `/detailKK/:no_kk/listAnggota`,
        component: ListAnggota,
        name : 'listak',
    },
    {
        path: `/detailKK/:id/listAnggota/detailAnggota`,
        component: DetailAK,
        name : 'detailak',
    }

];