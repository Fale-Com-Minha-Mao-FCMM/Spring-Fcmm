package com.fatec.fcmm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.fcmm.model.Cadastro;
import com.fatec.fcmm.services.MantemCadastro;

//Essa classe será responsável por controlar e retornar as views.

/*Como criar rota?
 * Para criar a rota é bem simples, pasta tu começar com o @GetMapping e entre parenteses e aspas você vai colocar o nome da rota.
 * no caso do @GetMapping("/") ele declara que é home (inicio do site).
 * Depois disso, voce escreve public ModelAndView qualquerCoisa() e abre as chaves {}.
 * Dentro das chaves você vai colocar 'return new ModelAndView("nomeIdenticoAoDoHTML");'
 * OBS: Não precisa colocar ".html" no final, apenas o nome.
*/

@Controller
@RequestMapping
public class GUIHomeController {

@Autowired
MantemCadastro service;

@GetMapping("/")
public ModelAndView menu() {
return new ModelAndView("index");
}


// @GetMapping("/criar-usuario")
// public ModelAndView showIndex(Cadastro cadastro) {
//     ModelAndView mv = new ModelAndView("cadastroUsuario");
//     mv.addObject("cadastroUsuario", cadastro);
//     return mv;
// }
// @GetMapping("/admin")
// public ModelAndView formAdmin() {
//     return new ModelAndView("crudAdmin");
// }

@GetMapping("/login")
public ModelAndView formLogin() {
    return new ModelAndView("login");
}

// @GetMapping("/crud")
// public ModelAndView formCrud() {
//     return new ModelAndView("crudAdmin");
// }

// @GetMapping("/crudAluno")
// public ModelAndView formCrudAluno(){
//     return new ModelAndView("crudAdminAluno");
// }
// @GetMapping("/crudCapitulos")
// public ModelAndView formCrudCapitulos(){
//     return new ModelAndView("crudAdminCapitulos");
// }

@GetMapping("/home")
public ModelAndView homeUsuario() {
    return new ModelAndView("homeUsuario");
}

@GetMapping("/capitulos")
public ModelAndView visucapitulos() {
    return new ModelAndView("capitulos");
}

@GetMapping("/faleConosco")
public ModelAndView visuFaleConosco() {
    return new ModelAndView("faleconosco");
}
@GetMapping("/sobreNos")
public ModelAndView visuSobreNos() {
    return new ModelAndView("sobrenos");
}
@GetMapping("/infos")
public ModelAndView visuInformacoes() {
    return new ModelAndView("informacoesUsuario");
}
}