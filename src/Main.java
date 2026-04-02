//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
ProdejceBioMrkve billa = new ProdejceBioMrkve("Billa",LocalDate.now(),34,45.7,true);
ProdejceBioMrkve lidl = new ProdejceBioMrkve("Lidl",LocalDate.of(2026,1,1),2,2.1,false);

IO.println(billa.getNazevProdejce());
IO.println(lidl.getNazevProdejce());
}
