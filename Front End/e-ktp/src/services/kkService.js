import http from "../http-common";

class kkService {
    create(data) {
        return http.post("/kk/insert", data);
    }

    getAll(){
        return http.get("/kk/getAll");
    }
    deleteKK(id) {
        return http.delete(`/kk/delete/${id}`);
      }
    
      updateKK(id, data) {
        return http.put(`/kk/update/${id}`, data);
      }
      updateGetId(id) {
        return http.get(`/kk/updateGetId/${id}`);
      }
}

export default new kkService();