package logic;

import java.util.Map;

public class HuffmanManager implements ILogic
{
    private Logic logic;

    public HuffmanManager(Logic logic)
    {
        this.logic = new Logic();
    }

    @Override
    public int[] buildFrequencyTable(String data)
    {
        return logic.buildFrequencyTable(data);
    }

    @Override
    public HuffmanEncodedResult compress(String data)
    {
        return logic.compress(data);
    }

    @Override
    public String decompress(HuffmanEncodedResult result) throws IllegalAccessException
    {
        return logic.decompress(result);
    }

    @Override
    public Node buildHuffmanTree(int[] frequency)
    {
        return logic.buildHuffmanTree(frequency);
    }

    @Override
    public Map<Character, String> buildBitCodeLookupTable(Node root)
    {
        return logic.buildBitCodeLookupTable(root);
    }

    @Override
    public String generateEncodedData(String data, Map<Character, String> lookupTable)
    {
        return logic.generateEncodedData(data, lookupTable);
    }
}
