import java.util.*;
import java.sql.*;

public class AmbiguousImport{
/* if Date Object is not declared this will still compile!
 * if its declared it will say "***Date is ambiguous"
 */
   Date date;
}
