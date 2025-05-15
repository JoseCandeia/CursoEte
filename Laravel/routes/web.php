<?php

use App\Http\Controllers\HomeController;
use App\Http\Controllers\LoginController;
use Illuminate\Routing\RouteRegistrar;
use Illuminate\Support\Facades\Route;



Route::get('/',[HomeController::class,'home'])->name('home');
// Route::get('/login',[LoginController::class,'login'])->name('login');
Route::resource('/login', LoginController::class);
