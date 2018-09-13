import java.util.*;
import java.sql.*;
//import java.util.Date;
//import java.sql.Date;
public class AmbiguousImport{
/* if Date Object is not declared and imports are wildcard
 * this will still compile!
 * 
 * if Date object is imported exactly as the commented import.
 * compilation error!
 *
 * if its declared it will say "***Date is ambiguous"
 */
   Date date;
}
