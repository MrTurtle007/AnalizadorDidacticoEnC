
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed May 04 07:48:33 CDT 2022
//----------------------------------------------------

package clases;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed May 04 07:48:33 CDT 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\003\003\000\002\003\004\000\002\003" +
    "\003\000\002\004\005\000\002\004\007\000\002\004\007" +
    "\000\002\004\006\000\002\004\006\000\002\004\007\000" +
    "\002\004\010\000\002\004\005\000\002\004\011\000\002" +
    "\004\014\000\002\004\013\000\002\006\011\000\002\013" +
    "\003\000\002\013\005\000\002\013\005\000\002\013\005" +
    "\000\002\013\006\000\002\013\007\000\002\007\015\000" +
    "\002\010\011\000\002\011\013\000\002\012\011\000\002" +
    "\014\012\000\002\014\011\000\002\005\005\000\002\005" +
    "\004\000\002\005\004\000\002\015\011\000\002\016\011" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\223\000\006\007\004\054\005\001\002\000\004\054" +
    "\220\001\002\000\004\033\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\034\011\001" +
    "\002\000\004\037\012\001\002\000\016\007\026\010\027" +
    "\011\022\014\014\015\015\016\025\001\002\000\024\007" +
    "\ufff2\010\ufff2\011\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2" +
    "\020\ufff2\040\ufff2\001\002\000\004\033\212\001\002\000" +
    "\004\033\157\001\002\000\024\007\ufffb\010\ufffb\011\ufffb" +
    "\013\ufffb\014\ufffb\015\ufffb\016\ufffb\020\ufffb\040\ufffb\001" +
    "\002\000\024\007\ufff7\010\ufff7\011\ufff7\013\ufff7\014\ufff7" +
    "\015\ufff7\016\ufff7\020\ufff7\040\ufff7\001\002\000\024\007" +
    "\ufffd\010\ufffd\011\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd" +
    "\020\ufffd\040\ufffd\001\002\000\024\007\ufff9\010\ufff9\011" +
    "\ufff9\013\ufff9\014\ufff9\015\ufff9\016\ufff9\020\ufff9\040\ufff9" +
    "\001\002\000\004\033\145\001\002\000\022\007\026\010" +
    "\027\011\022\013\113\014\014\015\015\016\025\040\144" +
    "\001\002\000\024\007\ufff4\010\ufff4\011\ufff4\013\ufff4\014" +
    "\ufff4\015\ufff4\016\ufff4\020\ufff4\040\ufff4\001\002\000\004" +
    "\033\074\001\002\000\006\043\052\056\051\001\002\000" +
    "\004\056\030\001\002\000\010\035\031\050\033\051\032" +
    "\001\002\000\004\055\040\001\002\000\004\006\034\001" +
    "\002\000\024\007\uffea\010\uffea\011\uffea\013\uffea\014\uffea" +
    "\015\uffea\016\uffea\020\uffea\040\uffea\001\002\000\004\056" +
    "\035\001\002\000\004\006\036\001\002\000\004\050\037" +
    "\001\002\000\024\007\uffe9\010\uffe9\011\uffe9\013\uffe9\014" +
    "\uffe9\015\uffe9\016\uffe9\020\uffe9\040\uffe9\001\002\000\004" +
    "\036\041\001\002\000\004\051\042\001\002\000\004\005" +
    "\043\001\002\000\006\005\045\056\044\001\002\000\004" +
    "\005\047\001\002\000\004\050\046\001\002\000\024\007" +
    "\uffe7\010\uffe7\011\uffe7\013\uffe7\014\uffe7\015\uffe7\016\uffe7" +
    "\020\uffe7\040\uffe7\001\002\000\004\050\050\001\002\000" +
    "\024\007\uffe8\010\uffe8\011\uffe8\013\uffe8\014\uffe8\015\uffe8" +
    "\016\uffe8\020\uffe8\040\uffe8\001\002\000\014\035\056\042" +
    "\057\043\060\050\061\051\055\001\002\000\004\056\053" +
    "\001\002\000\004\050\054\001\002\000\024\007\uffed\010" +
    "\uffed\011\uffed\013\uffed\014\uffed\015\uffed\016\uffed\020\uffed" +
    "\040\uffed\001\002\000\004\055\072\001\002\000\006\036" +
    "\066\055\065\001\002\000\004\055\063\001\002\000\004" +
    "\050\062\001\002\000\024\007\ufff1\010\ufff1\011\ufff1\013" +
    "\ufff1\014\ufff1\015\ufff1\016\ufff1\020\ufff1\040\ufff1\001\002" +
    "\000\024\007\uffee\010\uffee\011\uffee\013\uffee\014\uffee\015" +
    "\uffee\016\uffee\020\uffee\040\uffee\001\002\000\004\050\064" +
    "\001\002\000\024\007\ufff0\010\ufff0\011\ufff0\013\ufff0\014" +
    "\ufff0\015\ufff0\016\ufff0\020\ufff0\040\ufff0\001\002\000\004" +
    "\036\070\001\002\000\004\050\067\001\002\000\024\007" +
    "\uffec\010\uffec\011\uffec\013\uffec\014\uffec\015\uffec\016\uffec" +
    "\020\uffec\040\uffec\001\002\000\004\050\071\001\002\000" +
    "\024\007\uffeb\010\uffeb\011\uffeb\013\uffeb\014\uffeb\015\uffeb" +
    "\016\uffeb\020\uffeb\040\uffeb\001\002\000\004\050\073\001" +
    "\002\000\024\007\uffef\010\uffef\011\uffef\013\uffef\014\uffef" +
    "\015\uffef\016\uffef\020\uffef\040\uffef\001\002\000\004\056" +
    "\075\001\002\000\004\034\076\001\002\000\004\037\077" +
    "\001\002\000\004\017\101\001\002\000\004\040\143\001" +
    "\002\000\004\055\102\001\002\000\004\047\103\001\002" +
    "\000\016\007\026\010\027\011\022\014\014\015\015\016" +
    "\025\001\002\000\022\007\026\010\027\011\022\013\113" +
    "\014\014\015\015\016\025\020\115\001\002\000\024\007" +
    "\ufff3\010\ufff3\011\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3" +
    "\020\ufff3\040\ufff3\001\002\000\024\007\ufffc\010\ufffc\011" +
    "\ufffc\013\ufffc\014\ufffc\015\ufffc\016\ufffc\020\ufffc\040\ufffc" +
    "\001\002\000\024\007\ufff8\010\ufff8\011\ufff8\013\ufff8\014" +
    "\ufff8\015\ufff8\016\ufff8\020\ufff8\040\ufff8\001\002\000\024" +
    "\007\ufffe\010\ufffe\011\ufffe\013\ufffe\014\ufffe\015\ufffe\016" +
    "\ufffe\020\ufffe\040\ufffe\001\002\000\024\007\ufffa\010\ufffa" +
    "\011\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa\020\ufffa\040" +
    "\ufffa\001\002\000\024\007\ufff5\010\ufff5\011\ufff5\013\ufff5" +
    "\014\ufff5\015\ufff5\016\ufff5\020\ufff5\040\ufff5\001\002\000" +
    "\004\037\121\001\002\000\004\013\113\001\002\000\004" +
    "\022\116\001\002\000\016\007\026\010\027\011\022\014" +
    "\014\015\015\016\025\001\002\000\022\007\026\010\027" +
    "\011\022\013\113\014\014\015\015\016\025\040\uffd5\001" +
    "\002\000\024\007\ufff6\010\ufff6\011\ufff6\013\ufff6\014\ufff6" +
    "\015\ufff6\016\ufff6\020\ufff6\040\ufff6\001\002\000\016\007" +
    "\026\010\027\011\022\014\014\015\015\016\025\001\002" +
    "\000\022\007\026\010\027\011\022\013\113\014\014\015" +
    "\015\016\025\040\123\001\002\000\004\014\124\001\002" +
    "\000\004\033\125\001\002\000\006\044\130\056\127\001" +
    "\002\000\004\034\141\001\002\000\004\041\131\001\002" +
    "\000\006\034\uffe5\050\uffe5\001\002\000\012\005\135\044" +
    "\134\055\132\056\133\001\002\000\006\034\uffe3\050\uffe3" +
    "\001\002\000\006\034\uffe2\050\uffe2\001\002\000\006\034" +
    "\uffe4\050\uffe4\001\002\000\006\005\137\056\136\001\002" +
    "\000\004\005\140\001\002\000\006\034\uffe1\050\uffe1\001" +
    "\002\000\006\034\uffe0\050\uffe0\001\002\000\004\050\142" +
    "\001\002\000\024\007\uffdd\010\uffdd\011\uffdd\013\uffdd\014" +
    "\uffdd\015\uffdd\016\uffdd\020\uffdd\040\uffdd\001\002\000\024" +
    "\007\uffd6\010\uffd6\011\uffd6\013\uffd6\014\uffd6\015\uffd6\016" +
    "\uffd6\020\uffd6\040\uffd6\001\002\000\004\002\uffff\001\002" +
    "\000\006\044\130\056\127\001\002\000\004\034\147\001" +
    "\002\000\004\037\150\001\002\000\016\007\026\010\027" +
    "\011\022\014\014\015\015\016\025\001\002\000\022\007" +
    "\026\010\027\011\022\013\113\014\014\015\015\016\025" +
    "\040\152\001\002\000\026\007\uffe6\010\uffe6\011\uffe6\012" +
    "\153\013\uffe6\014\uffe6\015\uffe6\016\uffe6\020\uffe6\040\uffe6" +
    "\001\002\000\004\037\154\001\002\000\016\007\026\010" +
    "\027\011\022\014\014\015\015\016\025\001\002\000\022" +
    "\007\026\010\027\011\022\013\113\014\014\015\015\016" +
    "\025\040\156\001\002\000\024\007\uffdf\010\uffdf\011\uffdf" +
    "\013\uffdf\014\uffdf\015\uffdf\016\uffdf\020\uffdf\040\uffdf\001" +
    "\002\000\006\007\161\056\162\001\002\000\004\034\206" +
    "\001\002\000\004\056\177\001\002\000\004\051\163\001" +
    "\002\000\004\055\164\001\002\000\004\050\165\001\002" +
    "\000\006\044\130\056\127\001\002\000\004\050\167\001" +
    "\002\000\006\043\172\056\171\001\002\000\004\034\uffda" +
    "\001\002\000\006\042\174\043\175\001\002\000\004\056" +
    "\173\001\002\000\004\034\uffd7\001\002\000\004\055\176" +
    "\001\002\000\004\034\uffd8\001\002\000\004\034\uffd9\001" +
    "\002\000\004\051\200\001\002\000\004\055\201\001\002" +
    "\000\004\050\202\001\002\000\006\044\130\056\127\001" +
    "\002\000\004\050\204\001\002\000\006\043\172\056\171" +
    "\001\002\000\004\034\uffdb\001\002\000\004\037\207\001" +
    "\002\000\016\007\026\010\027\011\022\014\014\015\015" +
    "\016\025\001\002\000\022\007\026\010\027\011\022\013" +
    "\113\014\014\015\015\016\025\040\211\001\002\000\024" +
    "\007\uffdc\010\uffdc\011\uffdc\013\uffdc\014\uffdc\015\uffdc\016" +
    "\uffdc\020\uffdc\040\uffdc\001\002\000\006\044\130\056\127" +
    "\001\002\000\004\034\214\001\002\000\004\037\215\001" +
    "\002\000\016\007\026\010\027\011\022\014\014\015\015" +
    "\016\025\001\002\000\022\007\026\010\027\011\022\013" +
    "\113\014\014\015\015\016\025\040\217\001\002\000\024" +
    "\007\uffde\010\uffde\011\uffde\013\uffde\014\uffde\015\uffde\016" +
    "\uffde\020\uffde\040\uffde\001\002\000\004\033\221\001\002" +
    "\000\004\034\222\001\002\000\004\037\223\001\002\000" +
    "\016\007\026\010\027\011\022\014\014\015\015\016\025" +
    "\001\002\000\022\007\026\010\027\011\022\013\113\014" +
    "\014\015\015\016\025\040\225\001\002\000\004\002\000" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\223\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\022\004\017\006" +
    "\015\007\020\010\016\012\023\015\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\004\107\006\105\007\110\010" +
    "\106\011\113\012\111\015\104\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\016\077\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\003\103\004\017\006\015\007" +
    "\020\010\016\012\023\015\012\001\001\000\020\004\107" +
    "\006\105\007\110\010\106\011\113\012\111\015\104\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\117\001\001\000\002\001\001" +
    "\000\020\003\116\004\017\006\015\007\020\010\016\012" +
    "\023\015\012\001\001\000\020\004\107\006\105\007\110" +
    "\010\106\011\113\012\111\015\104\001\001\000\002\001" +
    "\001\000\020\003\121\004\017\006\015\007\020\010\016" +
    "\012\023\015\012\001\001\000\020\004\107\006\105\007" +
    "\110\010\106\011\113\012\111\015\104\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\125\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\013\145\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\003\150\004" +
    "\017\006\015\007\020\010\016\012\023\015\012\001\001" +
    "\000\020\004\107\006\105\007\110\010\106\011\113\012" +
    "\111\015\104\001\001\000\002\001\001\000\002\001\001" +
    "\000\020\003\154\004\017\006\015\007\020\010\016\012" +
    "\023\015\012\001\001\000\020\004\107\006\105\007\110" +
    "\010\106\011\113\012\111\015\104\001\001\000\002\001" +
    "\001\000\004\014\157\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\165\001\001\000\002\001\001\000\004" +
    "\005\167\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\202\001\001\000\002" +
    "\001\001\000\004\005\204\001\001\000\002\001\001\000" +
    "\002\001\001\000\020\003\207\004\017\006\015\007\020" +
    "\010\016\012\023\015\012\001\001\000\020\004\107\006" +
    "\105\007\110\010\106\011\113\012\111\015\104\001\001" +
    "\000\002\001\001\000\004\013\212\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\003\215\004\017\006\015" +
    "\007\020\010\016\012\023\015\012\001\001\000\020\004" +
    "\107\006\105\007\110\010\106\011\113\012\111\015\104" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\003\223\004\017\006\015" +
    "\007\020\010\016\012\023\015\012\001\001\000\020\004" +
    "\107\006\105\007\110\010\106\011\113\012\111\015\104" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // SENTENCIA_SWITCH ::= CASE NUMERO DOS_PUNTOS SENTENCIA BREAK DEFAULT SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_SWITCH",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // Switch ::= SWITCH PARENTESIS_ABRIR IDENTIFICADOR PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA_SWITCH LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("Switch",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= OP_INCRE_DECRE IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // DECLARACION_FOR ::= IDENTIFICADOR OP_INCRE_DECRE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DECLARACION_FOR ::= IDENTIFICADOR OP_ATRIBUCION NUMERO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // SENTENCIA_FOR ::= IDENTIFICADOR ASIGNACION NUMERO PUNTO_Y_COMA SENTENCIA_BOOLEANA PUNTO_Y_COMA DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // SENTENCIA_FOR ::= TIPO_DE_DATO IDENTIFICADOR ASIGNACION NUMERO PUNTO_Y_COMA SENTENCIA_BOOLEANA PUNTO_Y_COMA DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // For ::= FOR PARENTESIS_ABRIR SENTENCIA_FOR PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("For",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // DO_WHILE ::= DO LLAVE_ABRIR SENTENCIA LLAVE_CERRAR WHILE PARENTESIS_ABRIR SENTENCIA_BOOLEANA PARENTESIS_CERRAR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // While ::= WHILE PARENTESIS_ABRIR SENTENCIA_BOOLEANA PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("While",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // IF_ELSE ::= IF PARENTESIS_ABRIR SENTENCIA_BOOLEANA PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR ELSE LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= IDENTIFICADOR OP_RELACIONAL COMILLAS IDENTIFICADOR COMILLAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= IDENTIFICADOR OP_RELACIONAL COMILLAS COMILLAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= IDENTIFICADOR OP_RELACIONAL IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= IDENTIFICADOR OP_RELACIONAL NUMERO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= IDENTIFICADOR OP_RELACIONAL OP_BOOLEANO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= OP_BOOLEANO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // If ::= IF PARENTESIS_ABRIR SENTENCIA_BOOLEANA PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("If",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= CHAR IDENTIFICADOR CORCHETE_ABRIR NUMERO CORCHETE_CERRAR ASIGNACION COMILLAS COMILLAS PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= CHAR IDENTIFICADOR CORCHETE_ABRIR NUMERO CORCHETE_CERRAR ASIGNACION COMILLAS IDENTIFICADOR COMILLAS PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= CHAR IDENTIFICADOR ASIGNACION COMILLA_SIMPLE IDENTIFICADOR COMILLA_SIMPLE PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= CHAR IDENTIFICADOR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR CORCHETE_ABRIR NUMERO CORCHETE_CERRAR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR CORCHETE_ABRIR CORCHETE_CERRAR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= TIPO_DE_DATO OP_INCRE_DECRE IDENTIFICADOR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR OP_INCRE_DECRE PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR ASIGNACION NUMERO PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR OP_ATRIBUCION NUMERO PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= TIPO_DE_DATO IDENTIFICADOR PUNTO_Y_COMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA ::= Switch 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= SENTENCIA Switch 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= For 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA For 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= While 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA While 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= If 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA If 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= MAIN PARENTESIS_ABRIR PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= TIPO_DE_DATO MAIN PARENTESIS_ABRIR PARENTESIS_CERRAR LLAVE_ABRIR SENTENCIA LLAVE_CERRAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

