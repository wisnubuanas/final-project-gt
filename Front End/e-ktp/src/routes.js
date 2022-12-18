import Login from "./pages/Login.vue";
import Register from './pages/Register.vue'
import Home from "./pages/Home.vue";
import AddKK from "./pages/AddKK.vue";
import DetailAK from "./pages/DetailAK.vue"
import DetailKK from "./pages/DetailKK.vue"

export default[
    {
        path: "/",
        component : Login,
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
        path: "/detailKK",
        component : DetailKK,
    },
    {
        path: "/register",
        component : Register,
    },
];