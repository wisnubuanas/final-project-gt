import Login from "./pages/Login.vue";
import Home from "./pages/Home.vue";
import AddKK from "./pages/AddKK.vue"


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
];