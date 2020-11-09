package ch.fhnw.oop2.progtest1;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTasks {

    /**
     * Fügt die beiden Strings first und second beide je am Anfang und am Ende
     * der gegebenen Liste ein.
     * 
     * Beispiel: Für eine Liste ["a", "b", "c"] und die Strings "x" und "y",
     * sieht die Liste am Ende so aus: ["x", "y", "a", "b", "c", "x", "y"]
     */
    public static void listInsertStartEnd(List<String> list, String first, String second){
        list.add(first);
        list.add(second);
        list.add(0, first);
        list.add(1,second);

    }

    /**
     * Berechnet die Summe aller Zahlen in numbers und gibt sie zurück. Falls
     * numbers gleich null ist, soll -1 zurückgegeben werden.
     */
    public static int setSum(Set<Integer> numbers) {
        // TOD
        int result = 0;

        if (numbers==null){
            result = -1;
        }else {
            for (Integer i:
                 numbers) {
                result=result+i;
            }
        }
        return result;
    }

    /**
     * Entfernt alle Einträge aus der gegebenen Map, bei welchen der Schlüssel
     * negativ ist.
     * 
     * Achtung: Falls es nichts zu entfernen gibt, soll die Methode auch mit
     * unveränderlichen Maps funktionieren.
     */
    public static void mapRemoveNegativeKeys(Map<Integer, String> map) {

        Iterator<Integer> iter = map.keySet().iterator();

        while (iter.hasNext()){
            int i = iter.next();
            if (i<0){
                iter.remove();
            }
        }
    }

    /**
     * Ersetzt jeden String s in der gegebenen Liste mit dem Wert, der in der
     * gegebenen Map mit diesem String assoziiert ist. Falls ein String keinen
     * assoziierten Wert in der Map hat, wird er entfernt.
     * 
     * Beispiel: Für eine Liste ["stupid", "idiot", "why", "did", "you"] und
     * einer Map {"stupid" = "unsmart", "idiot" = "fool"} ist das Resultat
     * ["unsmart", "fool"].
     */
    public static void listReplace(List<String> list, Map<String, String> map) {
        List<String> zwischenspeicher = new ArrayList<>();
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String s = iter.next();
            if (map.containsKey(s)){
                zwischenspeicher.add(map.get(s));
            }
        }list.clear();
        list.addAll(zwischenspeicher);
    }

    /**
     * Gibt den grösseren der beiden Werte zurück, die mit den beiden Strings
     * first und second in der gegebenen Map assoziiert sind. Falls einer der
     * beiden Strings nicht in der Map vorkommt, wird der Wert für den anderen
     * zurückgegeben; falls beide nicht vorkommen, wird null zurückgegegen.
     */
    public static Integer mapMax(Map<String, Integer> map, String first, String second) {



        return 3;
    }

    /**
     * Gibt ein neues Set zurück, welche alle Elemente enthält, die sich in
     * first oder in second befinden, aber nicht in beiden.
     * 
     * Achtung: Die übergebenen Sets first und second dürfen nicht verändert
     * werden.
     */
    public static Set<String> setSymmetricDiff(Set<String> first, Set<String> second) {
        // TODO
        Set<String> resultat = new HashSet<>();
        Iterator<String> iter = first.iterator();
        Iterator<String> iter2 = second.iterator();

        while (iter.hasNext()){
            if (iter.next().equals(iter2.next())){
                iter.remove();
                iter2.remove();
            }else {
                resultat.add(iter.next());
                resultat.add(iter2.next());
            }
        }
        return resultat;
    }

    /**
     * Fügt den gegebenen Wert in die gegebene, aufsteigend sortierte Liste ein,
     * so dass die Liste weiterhin sortiert bleibt. Falls die Liste zu Beginn
     * unsortiert ist, ist das Verhalten undefiniert (d.h. Sie müssen sich zu
     * diesem Fall keine Gedanken machen).
     * 
     * Beispiel: Für eine Liste [1, 4, 5, 8] und den Wert 7 sieht die Liste am
     * Ende so aus: [1, 4, 5, 7, 8].
     * 
     * Hinweis: Die Effizienz der Lösung ist nicht relevant.
     */
    public static void listInsertSorted(List<Integer> list, int value) {
        // TODO
    }

    /**
     * Entfernt aus der Map first alle Einträge, welche einen Wert haben, der
     * nicht als Schlüssel in der Map second vorkommt.
     */
    public static void mapRemoveNonKeys(Map<String, Integer> first,
            Map<Integer, Double> second) {
        // TODO
    }
}
