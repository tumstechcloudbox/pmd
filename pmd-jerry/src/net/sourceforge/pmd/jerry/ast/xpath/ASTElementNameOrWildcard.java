/* Generated By:JJTree: Do not edit this line. ASTElementNameOrWildcard.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTElementNameOrWildcard extends SimpleNode {
  public ASTElementNameOrWildcard(int id) {
    super(id);
  }

  public ASTElementNameOrWildcard(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
