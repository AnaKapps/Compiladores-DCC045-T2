/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class And extends BinOp {

  public And(int line, int column, Expr l, Expr r){
    super(line, column, l, r);
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
