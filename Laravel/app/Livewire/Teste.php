<?php

namespace App\Livewire;

use Livewire\Component;

class Teste extends Component
{
    public $nome='carlos';
    public function render()
    {
        return view('livewire.teste');
    }
}
