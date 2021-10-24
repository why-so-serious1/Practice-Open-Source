""" This is a trial modules which prints lists """


def print_list(the_list):
    """This is a function which print recursive lists"""
    for each_item in the_list:
        if isinstance(each_item, list):
            print_list(each_item)
        else:
            print(each_item)


print_list([1, [2, 3, [4, 5, [6, 7]], 8]])
