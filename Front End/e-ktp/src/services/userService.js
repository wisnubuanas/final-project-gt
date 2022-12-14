import http from "../http-common";

class userService {
    create(data) {
        return http.post("/user/insert", data);
    }

    getAll(){
        return http.get("/user/getAll");
    }
    deleteUser(id) {
        return http.delete(`/user/delete/${id}`);
      }
    
      updateUser(id, data) {
        return http.put(`/user/update/${id}`, data);
      }
      updateGetId(id) {
        return http.get(`/user/updateGetId/${id}`);
      }
}

export default new userService();