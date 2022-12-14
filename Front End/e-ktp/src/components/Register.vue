<template>
  <div>
    <div class="border border-secondary p-5 mt-5 mb-5 rounded" id="x" style="width: 900px; margin:auto">
      <h3 id="d">Daftar</h3>
      <div class="d-flex flex-center p-3 mt-2 mr-4">

    <form id="q" style="width: 500px; margin: auto">
      <div class="form-row">
    <label class="col-sm-2 col-form-label">Nama Lengkap</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="" placeholder="Email">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="" placeholder="Password">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="" placeholder="Email">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">Repassword</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="" placeholder="Password">
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-4 d-flex justify-content-around">
      <button type="submit" class="btn btn-danger">Login</button>
      <button type="submit" class="btn btn-primary">Daftar</button>
    </div>
  </div>
</form>
  </div>
    </div>
  </div>
  
</template>

<script>
export default {
name: 'registerComponents',
}
</script>

<style>
#x{
  margin-left: 100%;
}
#q{
  margin : auto;
}
#d{
  text-align: center;
}

</style>