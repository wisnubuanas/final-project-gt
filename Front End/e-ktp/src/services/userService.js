import http from "../http-common";

class userService {
  login(data){
    return http.post('/user/login',data)
}
  register(data){
    return http.post('/user/insert', data)
}
}

export default new userService();