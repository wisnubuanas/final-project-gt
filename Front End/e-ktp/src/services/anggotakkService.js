import http from "../http-common";

class anggotakkService {
    create(data) {
        return http.post("/anggotakk/insert", data);
    }

    getAll(){
        return http.get("/anggotakk/getAll");
    }
    deleteAnggotaKK(id) {
        return http.delete(`/anggotakk/delete/${id}`);
      }
    
      updateAnggotaKK(id, data) {
        return http.put(`/anggotakk/update/${id}`, data);
      }
      updateGetId(id) {
        return http.get(`/anggotakk/updateGetId/${id}`);
      }
      getAnggotaKK(id_kk) {
        return http.get(`/anggotakk/getAnggotaKK/${id_kk}`)
      }
}

export default new anggotakkService();