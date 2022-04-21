class Test
{
    public static void main(String[] args)
    {
        String name=args[0];
        String dept=args[1];
        boolean status=Boolean.parseBoolean(args[2]);
        System.out.println(name+" from the department of " +dept + " has paid the fee "+ status);
    }
}